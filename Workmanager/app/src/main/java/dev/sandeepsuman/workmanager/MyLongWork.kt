package dev.sandeepsuman.workmanager

import android.content.Context
import android.widget.Toast
import androidx.work.CoroutineWorker
import androidx.work.Worker
import androidx.work.WorkerParameters

class MyLongWork(private val context: Context, workerParameters: WorkerParameters): CoroutineWorker(context, workerParameters) {

    override suspend fun doWork(): Result {
        for (i in 0..100) println("$i ${System.currentTimeMillis()}")
        return  Result.success()
    }

}