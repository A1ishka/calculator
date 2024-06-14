package com.a1ishka.calculator

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity(){

    private lateinit var expression: TextView
    private lateinit var result: TextView

    private lateinit var one: MaterialButton
    private lateinit var two: MaterialButton
    private lateinit var three: MaterialButton
    private lateinit var four: MaterialButton
    private lateinit var five: MaterialButton
    private lateinit var six: MaterialButton
    private lateinit var seven: MaterialButton
    private lateinit var eight: MaterialButton
    private lateinit var nine: MaterialButton
    private lateinit var zero: MaterialButton

    private lateinit var clear: MaterialButton
    private lateinit var add: MaterialButton
    private lateinit var opposite: MaterialButton
    private lateinit var divine: MaterialButton
    private lateinit var module: MaterialButton
    private lateinit var multiply: MaterialButton
    private lateinit var subtract: MaterialButton
    private lateinit var dot: MaterialButton
    private lateinit var equal: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        expression = findViewById(R.id.expression_picker_tv)
        result = findViewById(R.id.result_tv)
        one = findViewById(R.id.btn_1)
        two = findViewById(R.id.btn_2)
        three = findViewById(R.id.btn_3)
        four = findViewById(R.id.btn_4)
        five = findViewById(R.id.btn_5)
        six = findViewById(R.id.btn_6)
        seven = findViewById(R.id.btn_7)
        eight = findViewById(R.id.btn_8)
        nine = findViewById(R.id.btn_9)
        zero = findViewById(R.id.btn_0)
        dot = findViewById(R.id.btn_dot)
        multiply = findViewById(R.id.btn_multiply)
        subtract = findViewById(R.id.btn_subtract)
        module = findViewById(R.id.btn_module)
        add = findViewById(R.id.btn_add)
        opposite = findViewById(R.id.btn_opposite)
        equal = findViewById(R.id.btn_result)
        divine = findViewById(R.id.btn_divine)
        clear = findViewById(R.id.btn_clear)

        var str: String
        val operators = listOf("+", "-", "*", "/", ".", "%")

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true

        one.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "1"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "1"
                expressionText(str)
                resultText()
            }
        }
        two.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "2"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "2"
                expressionText(str)
                resultText()
            }
        }
        three.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "3"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "3"
                expressionText(str)
                resultText()
            }
        }
        four.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "4"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "4"
                expressionText(str)
                resultText()
            }
        }
        five.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "5"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "5"
                expressionText(str)
                resultText()
            }
        }
        six.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "6"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "6"
                expressionText(str)
                resultText()
            }
        }
        seven.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "7"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "7"
                expressionText(str)
                resultText()
            }
        }
        eight.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "8"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "8"
                expressionText(str)
                resultText()
            }
        }
        nine.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "9"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "9"
                expressionText(str)
                resultText()
            }
        }
        zero.setOnClickListener {
            if (expression.text.toString().startsWith("0")) {
                str = expression.text.toString().replace("0", "") + "0"
                expressionText(str)
                resultText()
            } else {
                str = expression.text.toString() + "0"
                expressionText(str)
                resultText()
            }
        }
        add.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "+"
                expressionText(str)
            }
        }
        subtract.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "-"
                expressionText(str)
            }
        }
        multiply.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "*"
                expressionText(str)
            }
        }
        module.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "%"
                expressionText(str)
            }
        }
        dot.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "."
                expressionText(str)
            }
        }
        clear.setOnClickListener {
            if (expression.text.toString().isNotEmpty()) {
                val lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0, lastIndex)
                expressionText(str)
                resultText()
            }
        }
        clear.setOnLongClickListener {
            expressionText("0")
            expression.textSize = 60F
            result.textSize = 30F
            result.setTextColor( resources.getColor(R.color.light_gray,  null))
            resultText()
            true
        }
        divine.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "/"
                expressionText(str)
            }
        }
        equal.setOnClickListener {
            expression.textSize = 30F
            result.textSize = 60F
            result.setTextColor( resources.getColor(R.color.white,  null))
        }
        opposite.setOnClickListener {
            val exp = expression.text.toString()
            val regex = "[-+]?\\d+(\\.\\d+)?"
            val numberRegex = Regex(regex)
            val matchResults = numberRegex.findAll(exp)
            val lastNumber = matchResults.lastOrNull()?.value

            if (lastNumber != null) {
                val updatedNumber = when {
                    lastNumber.startsWith("-") -> "+${lastNumber.substring(1)}"
                    lastNumber.startsWith("+") -> "-${lastNumber.substring(1)}"
                    else -> "-$lastNumber"
                }
                val updatedExpression = exp.replaceLast(lastNumber, updatedNumber)
                expressionText(updatedExpression)
                resultText()
            }
        }
    }

    private fun String.replaceLast(oldValue: String, newValue: String): String {
        val lastIndex = this.lastIndexOf(oldValue)
        return if (lastIndex >= 0) {
            this.substring(0, lastIndex) + newValue + this.substring(lastIndex + oldValue.length)
        } else {
            this
        }
    }

    private fun expressionText(str: String) {
        expression.text = str
    }

    private fun resultText() {
        val exp = expression.text.toString()
        try {
            val res = evaluateExpression(exp)
            if (res.toString().endsWith(".0")) {
                result.text = "=$res".replace(".0", "")
            } else {
                result.text = "=$res"
            }
        } catch (e: Exception) {
            expression.text = exp
            result.text = exp
        }
    }
}
