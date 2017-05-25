function processData(input) {
    size = input[0];
    arr = [];
    count = 0;
    for (var i = 1; i <= size; i++){
        thishat = input.split('\n');
        arr.push(thishat[i]);
    }
    
    for (var j = 0; j < arr.length; j++){
        count = 0;
        if((arr[j].length % 2) != 0){
            console.log('-1');
        }
        else {
            s1 = arr[j].substring(0, (arr[j].length)/2);
            s2 = arr[j].substring((arr[j].length)/2, (arr[j].length));
            
            for (i in s1){
                if (s2.includes(s1[i]) == false){
                    count++;
                }
            }
            console.log(count);
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
