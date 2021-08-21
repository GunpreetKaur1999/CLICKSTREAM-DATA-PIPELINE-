package com.igniteplus.data.pipeline.Helper

import com.igniteplus.data.pipeline.constants.ApplicationConstants.SPARK_CONF
import com.igniteplus.data.pipeline.util.ApplicationUtil.createSparkSession

trait Helper {

  /* Helpers for File Reader Service Test Case */
  val READ_LOCATION : String = "data/Test_Inputs/FileReaderServiceTestCaseInput.csv"
  val FILE_FORMAT : String = "csv"
  val COUNT_SHOULD_BE : Int = 4
  val READ_WRONG_LOCATION : String = "data/Test_Inputs/FileReaderServiceTestCaseInp.csv"

  /* Helpers for File Writer Service Test Case */
  implicit val spark = createSparkSession(SPARK_CONF)
  val writeTestCaseInputPath ="data/Test_Inputs/FileWriterServiceTestCaseInput.csv"
  val fileFormat = "csv"
  val writeTestCaseOutputPath = "data/Test_Outputs/FileWriterServiceTestCaseOutput.csv"


  /* Helpers for removeDuplicates Test Case*/
  val DEDUPLICATION_TEST_READ : String = "data/Test_Inputs/DeDuplicationTestCaseInput.csv"
  val PRIMARY_KEY_COLUMNS_CLICKSTREAM_DATA : Seq[String] = Seq("session_id","item_id")
  val ORDER_BY_COLUMN : String = "event_timestamp"

  /* Helpers for join Test Case*/
  val  INPUT_JOIN_CLICKSTREAM : String = "data/Test_Inputs/JoinClickstreamTestCaseInput.csv"
  val  INPUT_JOIN_ITEM : String = "data/Test_Inputs/JoinItemTestCaseInput.csv"

}
