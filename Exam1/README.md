#  ����Exam1
mvn archetype:generate -DgroupId=com.hand -DartifactId=Exam1 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -DarchetypeCatalog=internal

#ִ����Ŀ
cd Exam1

mvn exec:java -Dexec.mainClass="com.hand.App"

