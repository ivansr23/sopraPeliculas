console.log("Mi primer log de en nodejs")
variableGlobal = "mi variable global declarada";
var estaTambienEsGlobal = "otra variable global!"

laFuncionIrAlLet()
laFuncionIrAlVar()

function laFuncionIrAlVar(){
    var variableLoca = "estoy de mañana!"
    for (var i = 0; i < 10; i++) {
        console.log("contenido de i"+ i);
    }
    console.log("valor de i al final" + i)
}

function laFuncionIrAlLet(){
    var otraVariableLoca = "Otra varible local"
    variableDeMierda = "ole ole y ole"
    for (let i = 0; i < 10; i++) {
        console.log("contenido de i"+ i);
    }
    //La i no existe fuera del for por eso la i falla
   // console.log("valor de i al final" + i)
}
console.log("/////////////////////////////////////////////////////////////////////////////////////////////////////")
console.log("Evaluar los tipos de datos")
var tipoDedatoNumerico = 8;
var tipoDeDatoCadena = "cadenilla"
var tipoDeDatoFecha = new Date()
var referenciaAUnaFecha = tipoDeDatoFecha

cambiemosLaFecha(tipoDeDatoFecha)
console.log("Fecha original"+ tipoDeDatoFecha)
console.log("Fecha de la renferencia"+ referenciaAUnaFecha)


function cambiemosLaFecha(fecha){
    fecha.setFullYear(1999)
    console.log("fecha cambiada"+ fecha)
}

console.log("dime el tipo de la variable con un numerico"+ typeof tipoDedatoNumerico)
console.log("dime el tipo de la variable con un cadena"+ typeof tipoDeDatoCadena)
console.log("dime el tipo de la variable con un fecha"+ typeof tipoDeDatoFecha)
operacionesNumericas(1,2,3,4)
operacionesNumericas()
function operacionesNumericas(){
    let miNumero = new Number(3.141592654)
    console.log("Valor almacenado " + miNumero.valueOf())
    console.log("Valor almacenado " + miNumero.toFixed())
    console.log("Valor almacenado " + miNumero.toFixed(4))
}

funcionHiperMegaGuayDeLaMuerte();
funcionHiperMegaGuayDeLaMuerte(1);
funcionHiperMegaGuayDeLaMuerte("mega", "guay");
funcionHiperMegaGuayDeLaMuerte(12,2,2,3,4,5,6,7);

function funcionHiperMegaGuayDeLaMuerte(mega, guay){
    console.log("Numero de parametros recibidos" + arguments.length)
    console.log("Numero de argumentos esperados" + arguments.callee.length)
    if (arguments.length==arguments.callee.length) {
        console.log(mega + " " + guay)
    }

    if(arguments.length==1){
        console.log("Con"+ mega + " me conformo!");
    }
}

function comoMeGustanLasArrayas(){
    let unArray = new Array();
    unArray[0] = 7 
    unArray[1] = "Mis mierdas"
    console.log("El ultimo elemento es "+ unArray[unArray.length-1])
    let otroArray=[0,"valor",new Date()]
    let miArrayAsociativo = new Array()
    miArrayAsociativo['clave']= "valor"
    let persona = new Array()
    persona.nombre="Ruben"
    persona.apellido1="miauuu"
    persona.funcioncilla = funcionHiperMegaGuayDeLaMuerte
    persona.funcioncilla("soy","guay") 
    //console.log("El ultimo elemento es "+ persona)

}
comoMeGustanLasArrayas()

function Cubata(yelosChacho, licorcillo){
    this.losYelos=yelosChacho
    this.licor=licorcillo
    //Sumidero de memoria, crea una funcion por cada uno de los objetos generados
    this.echarUnTrago= function(){
        return this.losYelos+" "+ this.licorcillo
    }
}

Cubata.prototype.generameUnString = function(){
    return this.losYelos + " " + this.licor
}
var miCubata = new Cubata("Dos yelos", "Roncillo de los de dolor de cabeza")
console.log(miCubata.echarUnTrago())

