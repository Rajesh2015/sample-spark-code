package io.github.rajesh2015.samplespark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql._
import org.apache.spark.sql.types._
object SampleProgram {
  def main(args: Array[String]): Unit = {
val sparkSession=SparkSession.builder().master("local[*]").appName("io/github/rajesh2015/samplespark").getOrCreate()
    val data =
      Seq(("Category A", 100, "This is category A"),
        ("Category B", 120, "This is category B"),
        ("Category C", 150, "This is category C"))

    val schema =
      StructType(
        StructField("Category", StringType, true) ::
          StructField("Count", IntegerType, true) ::
          StructField("Description", StringType, true) :: Nil)
    import sparkSession.implicits._
    data.toDF("Category","Count","Description").show()
    sparkSession.close()

  }

}
