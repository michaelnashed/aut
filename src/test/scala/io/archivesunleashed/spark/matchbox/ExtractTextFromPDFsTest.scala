/*
 * Archives Unleashed Toolkit (AUT):
 * An open-source platform for analyzing web archives.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package io.archivesunleashed.spark.matchbox

 import org.junit.runner.RunWith
 import org.scalatest.FunSuite
 import org.scalatest.junit.JUnitRunner
 import io.archivesunleashed.spark.matchbox._
 import org.scalatest.Matchers._
 import org.apache.tika.parser.pdf.PDFParser;

 @RunWith(classOf[JUnitRunner])
 class ExtractTextFromPDFsTest extends FunSuite {
   test ("get parser") {
     ExtractTextFromPDFs.pdfParser shouldBe a [PDFParser]
 }

 }
