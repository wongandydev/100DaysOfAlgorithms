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
    c = readLine().split(' ');
    c = c.map(Number);
    
    var pairs = {};
    var count = 0;

    for(let sock of c) {
        pairs[sock] ? pairs[sock]++ : pairs[sock] = 1;
        if(pairs[sock]%2 === 0) count++;
    }

    console.log(count);
}


function main() {
    var n = parseInt(readLine());
    c = readLine().split(' ');
    c = c.map(Number);
    
    var matchingPairs = {};
    var matchingPairCount = 0;

    for(var i=0; i< c.length; i++) { 
        matchingPairs[""+c[i]] = matchingPairs[""+c[i]] || 0;
        matchingPairs[""+c[i]] += 1;

        if (matchingPairs[""+c[i]] % 2 === 0) {
            matchingPairCount += 1;
        }
    }
    console.log(matchingPairCount);

}