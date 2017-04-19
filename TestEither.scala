object Test{
	def main(args: Array[String]){
		// Application starts here
		val in = Console.readLine("Type either a String or Int: ")
		val result: Either[String , Int] = try{
			Right(in.toInt)
		}
		catch{
		    	case e: Exception => Left(in) 
		}

		println(result match {
			case Right(x) => "You passes me the Int:" + x + ", which I will increment and it will become "+(x+1)
			case Left(x) => "You passed the String: "+x
		})
	}
}
