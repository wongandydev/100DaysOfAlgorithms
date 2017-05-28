process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function main() {
    var n = parseInt(readLine());
    types = readLine().split(' ');
    types = types.map(Number);
    // your code goes here

     var arr = [];

    for(var i = 0; i < 5; i++){
        arr[i] = [];
        arr[i][0] = i + 1; //Case Number and TypeID 
        arr[i][1] = 0; //Counter 
    };

    for(var i = 0; i < n; i++){
        switch(types[i]){
            case 1:
                arr[0][1] += 1; break;
            case 2:
                arr[1][1] += 1; break;
            case 3:
                arr[2][1] += 1; break;
            case 4:
                arr[3][1] += 1; break;
            case 5:
                arr[4][1] += 1; break;
        };
    };
    arr.sort(function(a, b){ return b[1] - a[1]}); //Sort Array so the max is in the front and least at the end (Descending order)z
    console.log(arr[0][0]);
};
    

