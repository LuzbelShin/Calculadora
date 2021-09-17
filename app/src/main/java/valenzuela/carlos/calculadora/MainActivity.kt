package valenzuela.carlos.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var results: TextView = findViewById(R.id.textViewManejador) as TextView
        var dataEnter: TextView = findViewById(R.id.textViewIngresoDatos) as TextView

        val one: Button = findViewById(R.id.buttonOne) as Button
        val two: Button = findViewById(R.id.buttonTwo) as Button
        val three: Button = findViewById(R.id.buttonThree) as Button
        val four: Button = findViewById(R.id.buttonFour) as Button
        val five: Button = findViewById(R.id.buttonFive) as Button
        val six: Button = findViewById(R.id.buttonSix) as Button
        val seven: Button = findViewById(R.id.buttonSeven) as Button
        val eigth: Button = findViewById(R.id.buttonEight) as Button
        val nine: Button = findViewById(R.id.buttonNine) as Button
        val zero: Button = findViewById(R.id.buttonZero) as Button
        val plus: Button = findViewById(R.id.buttonPlus) as Button
        val less: Button = findViewById(R.id.buttonLess) as Button
        val div: Button = findViewById(R.id.buttonDiv) as Button
        val multi: Button = findViewById(R.id.buttonMulti) as Button
        val del: Button = findViewById(R.id.buttonDel) as Button
        val result: Button = findViewById(R.id.buttonResult) as Button



            var auxDigit: String = ""
            var auxOperation: String = ""
            var auxNumber = ""

            one.setOnClickListener{
                auxDigit = "1"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            two.setOnClickListener{
                auxDigit = "2"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            three.setOnClickListener{
                auxDigit = "3"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            four.setOnClickListener{
                auxDigit = "4"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            five.setOnClickListener{
                auxDigit ="5"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            six.setOnClickListener{
                auxDigit = "6"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            seven.setOnClickListener{
                auxDigit = "7"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            eigth.setOnClickListener{
                auxDigit = "8"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            nine.setOnClickListener{
                auxDigit = "9"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            zero.setOnClickListener{
                auxDigit = "0"
                if(auxNumber != null && auxNumber != "") {
                    auxNumber = auxNumber.plus(auxDigit)
                }else{
                    auxNumber = auxDigit
                }
                dataEnter.text = "$auxNumber"
            }

            plus.setOnClickListener{
                auxOperation = auxNumber.plus("+")
                results.setText(auxOperation)
                auxNumber = ""
                dataEnter.text = ""

            }

            less.setOnClickListener{
                auxOperation = auxNumber.plus("-")
                results.setText(auxOperation)
                auxNumber = ""
                dataEnter.text = ""
            }

            div.setOnClickListener{
                auxOperation = auxNumber.plus("/")
                results.setText(auxOperation)
                auxNumber = ""
                dataEnter.text = ""
            }

            multi.setOnClickListener{
                auxOperation = auxNumber.plus("x")
                results.setText(auxOperation)
                auxNumber = ""
                dataEnter.text = ""
            }

            result.setOnClickListener {
                var upper: String = auxOperation

                var lower: String = auxNumber

                var result = 0

                if (upper != null && lower != null) {
                    var operationSign: String = upper.get(upper.lastIndex).toString()

                    var firstNumber: Int = upper.dropLast(1).toInt()
                    var secondNumber: Int = lower.toInt()

                    if (firstNumber != 0) {

                            if (operationSign.equals("+")) {
                                result = firstNumber + secondNumber
                                auxNumber = ""
                            } else if (operationSign.equals("-")) {
                                result = firstNumber - secondNumber
                                auxNumber = ""
                            } else if (operationSign.equals("/")) {
                                result = firstNumber / secondNumber
                                auxNumber = ""
                            } else if (operationSign.equals("x")) {
                                result = firstNumber * secondNumber
                                auxNumber = ""
                            }
                    } else{
                        result = secondNumber
                    }
                    dataEnter.text = "$result"
                    auxNumber = ""
                }else{
                    Toast.makeText(applicationContext, "Favor de ingresar valores.", Toast.LENGTH_SHORT).show()
                }


            }

            del.setOnClickListener{
                auxNumber = auxNumber.dropLast(1)
                dataEnter.text = auxNumber
            }

    }

}