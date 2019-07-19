Array.prototype.sumarLosQueQuieras = function(){
    if(arguments.length>1){
        var suma=0;
        for(let i=0; i < arguments.length; i++){
            suma= suma+arguments[i]
        }
        return suma;
    }

}
Array.prototype.crearCadenas = function(){
    var cadena="";
    for(let i=0; i < this.length; i++){
        cadena= cadena.concat(this[i])
    }
    return cadena;
}
var arrayConSuma= new Array("holaa","adiooos","pablooo");


console.log(arrayConSuma.sumarLosQueQuieras(1,2,3,4))
console.log(arrayConSuma.crearCadenas())

let hombreObjeto = {}
let cartaDeCubatas = [{
        yelos : 2,
        licor : "whiskey"
    },
    {
        yelos:5,
        licor : "Ya no importa"
    },
    {
        yelos : 2,
        licor : "Cerveza"
    }
]
console.log(cartaDeCubatas[2].licor)