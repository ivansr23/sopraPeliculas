function initialize(){

}
var operador;
var primernumero;
var memoria=0;
var reset=false;
var firstMult=true;
var firstDiv=true;
var firstRest=true;
function escribirEnInput(boton){
  if(reset){
    document.getElementById("display").value=""
    reset=false
  }
  document.getElementById("display").value=document.getElementById("display").value+boton.value
}
function escribirOperador(boton){
  operador=boton.value;
  if(operador=="+"){
    memoria=parseFloat(memoria)+parseFloat(document.getElementById("display").value);
    document.getElementById("display").value=memoria;
    reset=true
  }
  if(operador=="-"){
    if(firstRest){
      memoria=document.getElementById("display").value;
      firstRest=false;
      reset=true
    }else{
      memoria=parseFloat(memoria)-parseFloat(document.getElementById("display").value);
      document.getElementById("display").value=memoria;
      reset=true
    }
  }
  if(operador=="*"){
    if((firstMult)&&(memoria==0)){
      memoria=document.getElementById("display").value;
      document.getElementById("display").value=""
      firstMult=false;
    }else{
      hola = memoria;
      memoria=parseFloat(memoria)*parseFloat(document.getElementById("display").value);
      document.getElementById("display").value=memoria;
      reset=true
    }
  }
  if(operador=="/"){
    if(firstDiv){
      firstDiv=false;
      memoria=document.getElementById("display").value
      document.getElementById("display").value=""
      
    }else{
      memoria=parseFloat(memoria)/parseFloat(document.getElementById("display").value);
      document.getElementById("display").value=memoria;
      reset=true
    }
  }
  
  primernumero=document.getElementById("display").value
  
}
function resultado(){
  var segundonumero=document.getElementById("display").value;
  if(operador=="+"){
    let resultado=parseFloat(primernumero)+parseFloat(segundonumero);
    document.getElementById("display").value=resultado;
    primernumero=resultado;
  }
  if(operador=="-"){
    let resultado=parseFloat(primernumero)-parseFloat(segundonumero);
    document.getElementById("display").value=resultado;
    primernumero=resultado;
  }
  if(operador=="*"){
    let resultado=parseFloat(primernumero)*parseFloat(segundonumero);
    document.getElementById("display").value=resultado;
    primernumero=resultado;
  }
  if(operador=="/"){
    let resultado=parseFloat(primernumero)/parseFloat(segundonumero);
    document.getElementById("display").value=resultado;
    primernumero=resultado;
  }
  reset=true
  memoria=0;
  firstMult=true;
  firstDiv=true;

}