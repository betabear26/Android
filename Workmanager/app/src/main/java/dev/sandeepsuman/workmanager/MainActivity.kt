package dev.sandeepsuman.workmanager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.OneTimeWorkRequest
import androidx.work.PeriodicWorkRequest
import androidx.work.WorkManager
import androidx.work.WorkRequest
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val workManager = WorkManager.getInstance(this)
        val workRequest = PeriodicWorkRequest.Builder(MyLongWork::class.java, 15, TimeUnit.MINUTES).build()

        workManager.enqueue(workRequest)

        //chaining

        val workRequest1 = OneTimeWorkRequest.Builder(MyLongWork::class.java).addTag("work1").build()
        val workRequest2 = OneTimeWorkRequest.Builder(MyLongWork::class.java).addTag("work2").build()
        val workRequest3 = OneTimeWorkRequest.Builder(MyLongWork::class.java).addTag("work3").build()

        // Sequential
        workManager.beginWith(workRequest1).then(workRequest2).then(workRequest3).enqueue()

        // Parallel then sequential
        workManager.beginWith(listOf(workRequest1, workRequest2)).then(workRequest3).enqueue()

        //Cancelling
        workManager.beginWith(workRequest1).then(workRequest2).then(workRequest3).enqueue()
        workManager.cancelAllWorkByTag("work1") // When work 1 is canceled subsequent chained request will not be called


    }
}