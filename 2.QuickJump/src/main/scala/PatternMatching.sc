def toYesOrNo(choice: Int): String = choice match {
  case 1 | 2 | 3 => "yes"
  case 0 => "no"
  case _ => "error"
}

def parseArgument(arg: String) = arg match {
  case "-h" | "--help" => "displayHelp"
  case "-v" | "--version" => "displayVerion"
  case whatever => "unknownArgument " + whatever
}

def parseComplexArgument(arg : String, value: Any) = (arg, value) match {
  case ("-l", lang) => "setLanguageTo(lang)"
  case ("-o" | "--optim", n : Int) if ((0 < n) && (n <= 5)) => "setOptimizationLevelTo(n)"
  case ("-o" | "--optim", badLevel) => "badOptimizationLevel(badLevel)"
  case ("-h" | "--help", null) => "displayHelp()"
  case bad => "badArgument(bad)"
}

def typedPattern(x: Any): String = x match {
  case i:Int => "integer: " + i
  case _:Double => "a double"
  case s:String => "I want to say " + s
}

