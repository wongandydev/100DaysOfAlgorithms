function processData(input) {
    var arr = input.split("\n")[1].split("");
    var seaLvl = 0;
    var valley = 0;
    
    for(var i = 0; i < arr.length; i++){
        if(arr[i] == 'D')
            {
                seaLvl--;
            }
        else
            {
             if(seaLvl == -1){
                 valley++;
                 
             }
                seaLvl++;
            }
    }
    
    console.log(valley);
    
    
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
