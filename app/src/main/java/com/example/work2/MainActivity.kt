package com.example.work2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val o = Toast.makeText(applicationContext,"ห้าม username กับ passwordเหมือนกัน.",Toast.LENGTH_LONG)
        val g = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val v = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val l = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        buttonOk.setOnClickListener(){
            if (this.username.text.toString() == "" || this.passA.text.toString() == "" || this.passB.text.toString() == ""){
                v.show()
            }
            else{
                if (this.username.text.toString() == this.passA.text.toString() || this.username.text.toString() == this.passA.text.toString()||
                    this.username.text.toString() == this.passA.text.toString() && this.username.text.toString() == this.passB.text.toString()){
                    o.show()
                }
                else
                    if (this.passA.text.toString() == this.passB.text.toString()){
                        l.show()
                    }
                    else{
                        g.show()
                    }
            }
        }

        buttonClear.setOnClickListener(){
            username.setText(null)
            passA.setText(null)
            passB.setText(null)
        }
    }
}