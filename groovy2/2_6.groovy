Map m=[yogesh:23,Akash:22,Sachin:25,anusha:24,Sanu:5,Aparna:29,Partho:32,Pankaj:28,Gaurav:26,bhumika:27]
print m.each{
    it
}
print "\n"
m.eachWithIndex{entry,index->
    print entry.key+":"+entry.value+", "
}
//apne name dkh ke khush ho jana//
