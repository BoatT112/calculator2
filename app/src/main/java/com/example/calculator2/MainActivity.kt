package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d: Double = 0.0

        button20.setOnClickListener {
            textView.setText("0")
        }
        button16.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "7")
            } else {
                textView.setText(textView.text.toString() + "7")
            }
        }
        button17.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "8")
            } else {
                textView.setText(textView.text.toString() + "8")
            }
        }
        button18.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "9")
            } else {
                textView.setText(textView.text.toString() + "9")
            }
        }
        button9.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "4")
            } else {
                textView.setText(textView.text.toString() + "4")
            }
        }
        button10.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "5")
            } else {
                textView.setText(textView.text.toString() + "5")
            }
        }
        button11.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "6")
            } else {
                textView.setText(textView.text.toString() + "6")
            }
        }
        button5.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "1")
            } else {
                textView.setText(textView.text.toString() + "1")
            }
        }
        button6.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "2")
            } else {
                textView.setText(textView.text.toString() + "2")
            }
        }
        button7.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("")
                textView.setText(textView.text.toString() + "3")
            } else {
                textView.setText(textView.text.toString() + "3")
            }
        }
        button2.setOnClickListener {
            if (textView.text == "0") {
                textView.setText("0")
            } else {
                textView.setText(textView.text.toString() + "0")
            }
        }
        button21.setOnClickListener {
            if (textView.text == "0" || textView.text.length.toString() == "1") {
                textView.setText("0")
            } else {
                textView.setText(textView.text.toString().dropLast(1))
            }
        }
        button3.setOnClickListener {
            if (!textView.text.toString().contains(".")) {
                textView.text = textView.text.toString() + "."
            }
        }
            button23.setOnClickListener {
                c = "/"
                a = textView.text.toString()
                textView.setText("0")
            }

        button19.setOnClickListener {
            c = "*"
            a = textView.text.toString()
            textView.setText("0")
        }
        button12.setOnClickListener {
            c = "-"
            a = textView.text.toString()
            textView.setText("0")
        }
        button8.setOnClickListener {
            c = "+"
            a = textView.text.toString()
            textView.setText("0")
        }
        button22.setOnClickListener {
            c = "%"
            a = textView.text.toString()
            textView.setText("0")
        }
        button4.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / textView.text.toString().toDouble())
                textView.setText(d.toString())
            } else if (c == "*") {
                d = (a.toString().toDouble() * textView.text.toString().toDouble())
                textView.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - textView.text.toString().toDouble())
                textView.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + textView.text.toString().toDouble())
                textView.setText(d.toString())
            }else if (c == "%") {
                d = (a.toString().toDouble() % textView.text.toString().toDouble())
                textView.setText(d.toString())
            }
        }

    }
}




