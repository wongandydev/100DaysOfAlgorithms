function processData(input) {
    //Enter your code here
    c = input.split('\n');
    size = c[0];
    arr = c[1].split(' ');
    quickSort(arr);
}

function quickSort(ar) { //Recursion
    if(ar.length < 2) { //If there is 1 element left, stop recursion. 
        return ar;     
    }

    var left = [];
    var right = [];

    for(var i = 1; i < ar.length; i++){ //Add to left and right lists. 

        if(ar[i] >= ar[0]){
           right.push(ar[i]) ;
        }
        else if(ar[i] < ar[0]){
           left.push(ar[i]);
        }
    }

    var sortLeft = quickSort(left); //recursively sort left list
    var sortRight = quickSort(right); //recursively sort right list.
    var combine = sortLeft.concat(ar[0]).concat(sortRight); //put everything together starting with left, then middlle then right. 
    console.log(combine.join(' ')); //prints combie with ' ' to join together with a space between. 
    return combine;
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
