package valenzuela.carlos.calculadora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var auxNumber: Int
        var auxOperation: Int
        var auxResult: Int

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



            var aux: String
            var aux2: String = ""
            one.setOnClickListener{
                aux = "1"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            two.setOnClickListener{
                aux = "2"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            three.setOnClickListener{
                aux = "3"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            four.setOnClickListener{
                aux = "4"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            five.setOnClickListener{
                aux ="5"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            six.setOnClickListener{
                aux = "6"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            seven.setOnClickListener{
                aux = "7"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            eigth.setOnClickListener{
                aux = "8"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            nine.setOnClickListener{
                aux = "9"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            zero.setOnClickListener{
                aux = "0"
                aux2.plus(aux)
                dataEnter.setText("")
                dataEnter.setText(aux2)
            }

            plus.setOnClickListener{
                results.setText(aux2.plus("+"))
            }

            less.setOnClickListener{
                results.setText(aux2.plus("-"))
            }

            div.setOnClickListener{
                results.setText(aux2.plus("/"))
            }

            multi.setOnClickListener{
                results.setText(aux2.plus("x"))
            }

            result.setOnClickListener {
                var auxUpper: String = result.text as String
                var result: Int = 0

                if (auxUpper != null) {
                    var auxOperation: String = auxUpper.get(auxUpper.lastIndex).toString()
                    var asNumber: Int = auxUpper.dropLast(1).toInt()
                    if (asNumber != 0) {
                        var auxLower: String = dataEnter.text as String
                        if (auxLower != null) {
                            var finalNumber: Int = auxLower.toInt()
                            if (auxOperation.equals("+")) {
                                result = asNumber + finalNumber
                            } else if (auxOperation.equals("-")) {
                                result = asNumber - finalNumber
                            } else if (auxOperation.equals("/")) {
                                result = asNumber / finalNumber
                            } else if (auxOperation.equals("x")) {
                                result = asNumber * finalNumber
                            }
                        }
                    }
                }

                dataEnter.text = "$result"
            }

            del.setOnClickListener{
                aux2 = aux2.dropLast(1)
            }

    }

}