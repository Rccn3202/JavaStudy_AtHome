function citycategoryChange(e){
    const citygroup2=document.getElementById("citygroup2");

    const city1=["1","2","3"];
    const city2=["4","5","6"];
    const city3=["7","8","9"];
    const city4=["11","22","33"];

    if(e.value=="city01"){
        add=city1;
    } else if(e.value=="city02"){
        add=city2;
    } else if(e.value=="city03"){
        add=city3;
    } else if(e.value=="city04"){
        add=city4;
    }

    citygroup2.options.length=1;

    for (property in add) {
        let opt = document.createElement("option");
        opt.value = add[property];
        opt.innerHTML = add[property];
        citygroup2.appendChild(opt);
    }
}

