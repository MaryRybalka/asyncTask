//package com.example.asynctask
//
//import android.os.AsyncTask
//
//class DownloadText : AsyncTask<String?, Int?, Int>() {
//        protected override fun doInBackground(vararg p0: String?): Int? {
//            val myProgress = 0
//            publishProgress(myProgress)
//            return result
//        }
//
//        protected override fun onProgressUpdate(vararg values: Int?) {
//            // [... Обновите индикатор хода выполнения, уведомления или другой
//            // элемент пользовательского интерфейса ...]
//        }
//
//        protected fun onPostExecute(vararg result: Int?) {
//            // [... Сообщите о результате через обновление пользовательского
//            // интерфейса, диалоговое окно или уведомление ...]
//        }
//    }