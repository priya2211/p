String str= "http://www.google.com?name=priya&age=22hobby=playing"
def var=str.tokenize("?")
def key
var.each{ 
 key=it.split("&")
}
key.each{ 
 println it
}