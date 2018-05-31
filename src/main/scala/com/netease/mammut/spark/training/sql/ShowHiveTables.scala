package com.netease.mammut.spark.training.sql

import org.apache.spark.sql.SparkSession

object ShowHiveTables {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession
      .builder()
      .appName("Show Hive Tables")
      .enableHiveSupport()
      .getOrCreate()
    spark.sql("show tables").show()
    spark.stop()
  }
}
