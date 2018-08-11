package com.example.asus.TicTackToe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private var playerList1 = ArrayList<Int>()
    private var playerList2 = ArrayList<Int>()
    private var Activeplayer = 1
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeView()
        setListeners()
    }

    /**
     * ============================================= The Function used to initialize the view ====================================================================================
     */
    private fun initializeView() {
        button1 = findViewById(R.id.btn1)
        button2 = findViewById(R.id.btn2)
        button3 = findViewById(R.id.btn3)
        button4 = findViewById(R.id.btn4)
        button5 = findViewById(R.id.btn5)
        button6 = findViewById(R.id.btn6)
        button7 = findViewById(R.id.btn7)
        button8 = findViewById(R.id.btn8)
        button9 = findViewById(R.id.btn9)
    }
    /**
     * ============================================= The Function used to Set Listeners the view ====================================================================================
     */
    private fun setListeners(){
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
    }
    /**
     * ============================================= overriding onClick function to handle click   ====================================================================================
     */
    override fun onClick(v: View?) {
        var cellID: Int = 0
        var buttonSelected = v as Button
        when (buttonSelected?.id) {
            R.id.btn1 -> cellID = 1
            R.id.btn2 -> cellID = 2
            R.id.btn3 -> cellID = 3
            R.id.btn4 -> cellID = 4
            R.id.btn5 -> cellID = 5
            R.id.btn6 -> cellID = 6
            R.id.btn7 -> cellID = 7
            R.id.btn8 -> cellID = 8
            R.id.btn9 -> cellID = 9
        }
        playGame(cellID, buttonSelected)

    }

    /**
     * ============================================= The Function provides the functionality to play game ====================================================================================
     */
    private fun playGame(cellID: Int, buttonSelected: Button) {
        if (Activeplayer == 1) {
            buttonSelected.text = "X"
            buttonSelected.setTextColor(Color.WHITE)
            buttonSelected.setBackgroundColor(Color.GREEN)
            playerList1.add(cellID)
            Activeplayer = 2
        } else {
            buttonSelected.text = "O"
            buttonSelected.setTextColor(Color.WHITE)
            buttonSelected.setBackgroundColor(Color.BLUE)
            playerList2.add(cellID)
            Activeplayer = 1
        }
        buttonSelected.isEnabled = false
        CheckWinner()
    }

    /**
     * ============================================= The Function used to Check Winner====================================================================================
     */
    private fun CheckWinner() {
        var winner = -1
        /**
         * For row 1
         * */
        if (playerList1.contains(1) && playerList1.contains(2) && playerList1.contains(3)) {
            winner = 1

        }
        if (playerList2.contains(1) && playerList2.contains(2) && playerList2.contains(3)) {
            winner = 2
        }

        /**
         * For row 2
         * */
        if (playerList1.contains(4) && playerList1.contains(5) && playerList1.contains(6)) {
            winner = 1
        }
        if (playerList2.contains(4) && playerList2.contains(5) && playerList2.contains(6)) {
            winner = 2
        }
        /**
         * For row 3
         * */

        if (playerList1.contains(7) && playerList1.contains(8) && playerList1.contains(9)) {
            winner = 1
        }
        if (playerList2.contains(7) && playerList2.contains(8) && playerList2.contains(9)) {
            winner = 2
        }

        /**
         * For Diagonal
         * */
        if (playerList1.contains(1) && playerList1.contains(5) && playerList1.contains(9)) {
            winner = 1
        }
        if (playerList2.contains(1) && playerList2.contains(5) && playerList2.contains(9)) {
            winner = 2
        }
        /**
         * For other Diagonal
         * */
        if (playerList1.contains(3) && playerList1.contains(5) && playerList1.contains(7)) {
            winner = 1
        }
        if (playerList2.contains(3) && playerList2.contains(5) && playerList2.contains(7)) {
            winner = 2
        }

        /**
         * For Col 1
         * */
        if (playerList1.contains(1) && playerList1.contains(4) && playerList1.contains(7)) {
            winner = 1
        }
        if (playerList2.contains(1) && playerList2.contains(4) && playerList2.contains(7)) {
            winner = 2
        }

        /**
         * For Col 2
         * */
        if (playerList1.contains(2) && playerList1.contains(5) && playerList1.contains(8)) {
            winner = 1
        }

        if (playerList2.contains(2) && playerList2.contains(5) && playerList2.contains(8)) {
            winner = 2
        }

        /**
         * For col 3
         * */
        if (playerList1.contains(3) && playerList1.contains(6) && playerList1.contains(9)) {
            winner = 1
        }
        if (playerList2.contains(3) && playerList2.contains(6) && playerList2.contains(9)) {
            winner = 2
        }
        if (winner != -1) {
            if (winner == 1) {
                Toast.makeText(this, "Winner is Player 1", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Winner is Player 2", Toast.LENGTH_LONG).show()
            }
        }

    }

}
