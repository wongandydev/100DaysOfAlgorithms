function processData(input) {
   var c = input.split('\n');
   var value = c[0];
   var size = c[1];
   var arr = c[2].split(' ');
    
   for (var i = 0; i < arr.length; i++){
       if (arr[i] == value){
           console.log(i);
       }
   }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
