object ScalaFirst {

  def main(args: Array[String]): Unit = {

    //While Loop
    var i = 0;
    while (i <= 10){
      println(i+" ");
      i += 1;
    }
  }

  //for loop
  for(i <- 1 to 10){
    println(i);
  }

  //loop through String
  var alphabates = "abcdefghijklmnopqrstuvwxyz"
  for (i <- 0 until alphabates.length){
    println(alphabates(i));
  }

}
