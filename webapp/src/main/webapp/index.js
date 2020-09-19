function funcionJS() {
	var varOne;
	varOne = document.getElementById("numId").value;
	if(isNaN(varOne) || varOne<1 || varOne>200){
		alert("requerimiento inválido");
	}else{
		alert("Entrada válida");
		document.getElementById("numId").innerHTML = varOne;
	}
}