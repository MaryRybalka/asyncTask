package com.example.asynctask

import android.icu.util.TimeUnit
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    private var startButton: Button? = null
    private var againButton: Button? = null
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text)
        progressBar = findViewById(R.id.progressbar)
        startButton = findViewById(R.id.button_start)
        againButton = findViewById(R.id.button_again)
    }

    fun onClick(view: View?) {
        val catTask = CatTask()
        catTask.execute()
    }

    internal inner class CatTask : AsyncTask<Void?, Void?, Void?>() {
        override fun onPreExecute() {
            super.onPreExecute()
            progressBar!!.visibility = View.VISIBLE
            startButton!!.visibility = View.INVISIBLE
            againButton!!.visibility = View.INVISIBLE
            textView!!.text = "In Process..."
        }

        protected override fun doInBackground(vararg p0: Void?): Void? {
            try {
                java.util.concurrent.TimeUnit.SECONDS.sleep(7)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
            return null
        }

        override fun onPostExecute(aVoid: Void?) {
            super.onPostExecute(aVoid)
            progressBar!!.visibility = View.INVISIBLE
            startButton!!.visibility = View.INVISIBLE
            againButton!!.visibility = View.VISIBLE
            textView!!.text = "Finish"
        }
    }
}