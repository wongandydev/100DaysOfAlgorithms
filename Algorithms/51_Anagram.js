function processData(input) {
    size = input[0];
    arr = [];
    count = 0;
    
    for (var i = 1; i <= size; i++){ //Add items from input to array 
        thishat = input.split('\n');
        arr.push(thishat[i]);
    }
    
    for (var j = 0; j < arr.length; j++){
        var letterArray = new Array(26);
        for (var i = 0; i < 26; i++){ //Add 0's to letterArray for ASCII algorithm
            letterArray[i] = 0;
        }
        
        count = 0; //Reset count
        
        if((arr[j].length % 2) == 0){
             for (var i = 0; i < arr[j].length/2; i++){
                var a = "a"
                var aCode = a.charCodeAt(0);
                letterArray[arr[j].charCodeAt(i) - aCode]++;
            }
            
            for (var i = arr[j].length/2; i < arr[j].length; i++){
                if (letterArray[arr[j].charCodeAt(i) - aCode] > 0){
                    letterArray[arr[j].charCodeAt(i) - aCode]--;
                }
            }
            
            for (var i = 0; i < 26; i++){
                    count += letterArray[i]; 
            }
            console.log(count);
        }
        else{
            console.log('-1');
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