def call(String fileName){
     echo "Filename is $fileName"
     sh'''
               pwd
               mkdir $1
              '''
}
