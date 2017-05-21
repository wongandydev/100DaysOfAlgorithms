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
    h = readLine().split(' '); //Spliting the input by each space.
    h = h.map(Number); // Placing input to a map.
    var word = readLine(); //setting word to what we have from readLine()
    var tempArr = [];
    var alphabet = ['a','b','c','d','e','f','g','h','i',
                    'j','k','l','m','n','o','p','q','r',
                    's','t','u','v','w','x','y','z']; //used for ASCII
    for( var i = 0; i < alphabet.length; i++ ){
        word.includes(alphabet[i]) ? tempArr.push(h[i]) : 0 ; //Find the equivalent from input letter in array
    };
    console.log( Math.max(...tempArr) * word.length ); //Find max number in tempArr and multiple with length of word
};
    
