let data = {
    image_id: "bo",
    value: 1
}

//GET
let settings = {
    method: "POST",
    headers: {
        //Mime Types
        "Content-Type": "application/json",
        "x-api-key": "cf8bbadc-9682-44a2-8b07-1b1b47575006"
    },
    body: JSON.stringify(data)
};

fetch('https://api.thecatapi.com/v1/votes', settings)
    .then(function(response){
        return response.json();
    })
    .then(function(info){
        console.log(info);
    })
    .catch(function(error){
        console.log(error);
    })
