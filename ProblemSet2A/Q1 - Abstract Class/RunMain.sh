set -x
echo -e "\033[1mCompiling all the java files into bytecode:\033[0m"
javac *.java

echo -e "\033[1mExecuting the main() method in class TestTriangle:\033[0m"
java TestTriangle