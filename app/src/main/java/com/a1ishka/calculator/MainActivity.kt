package com.a1ishka.calculator

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.a1ishka.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var expression: TextView
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        expression = findViewById(R.id.expression_picker_tv)
        result = findViewById(R.id.result_tv)

        var str: String
        val operators = listOf("+", "-", "*", "/", ".", "%")

        expression.movementMethod = ScrollingMovementMethod()
        expression.isActivated = true
        expression.isPressed = true

        binding.btn1.setOnClickListener {
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
        binding.btn2.setOnClickListener {
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
        binding.btn3.setOnClickListener {
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
        binding.btn4.setOnClickListener {
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
        binding.btn5.setOnClickListener {
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
        binding.btn6.setOnClickListener {
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
        binding.btn7.setOnClickListener {
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
        binding.btn8.setOnClickListener {
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
        binding.btn9.setOnClickListener {
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
        binding.btn0.setOnClickListener {
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
        binding.btnAdd.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "+"
                expressionText(str)
            }
        }
        binding.btnSubtract.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "-"
                expressionText(str)
            }
        }
        binding.btnMultiply.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "*"
                expressionText(str)
            }
        }
        binding.btnModule.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "%"
                expressionText(str)
            }
        }
        binding.btnDot.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "."
                expressionText(str)
            }
        }
        binding.btnClear.setOnClickListener {
            if (expression.text.toString().isNotEmpty()) {
                val lastIndex = expression.text.toString().lastIndex
                str = expression.text.toString().substring(0, lastIndex)
                expressionText(str)
                resultText()
            }
        }
        binding.btnClear.setOnLongClickListener {
            expressionText("0")
            expression.textSize = 60F
            result.textSize = 30F
            result.setTextColor(resources.getColor(R.color.light_gray, null))
            resultText()
            true
        }
        binding.btnDivine.setOnClickListener {
            val expressionToString = expression.text.toString()
            if (operators.any { expressionToString.endsWith(it) }) {
                str = expression.text.toString()
                expressionText(str)
            } else {
                str = expression.text.toString() + "/"
                expressionText(str)
            }
        }
        binding.btnResult.setOnClickListener {
            expression.textSize = 30F
            result.textSize = 60F
            result.setTextColor(resources.getColor(R.color.white, null))
        }
        binding.btnOpposite.setOnClickListener {
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
