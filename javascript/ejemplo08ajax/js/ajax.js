function dameLoMio(){
    var ajax = new XMLHttpRequest();
    ajax.open("GET","http://localhost:8082/peliculas");
    ajax.onreadystatechange=function(){
        if(ajax.status == 200 && ajax.readyState == 4){
            var datos = JSON.parse(ajax.response);
            console.log(datos);
            datos.forEach(element => {
                console.log(element);
                var id = element.id;
                var titulo = element.titulo;
                var director = element.director;
                var sipnosis = element.sipnosis;
                //var _stock = document.getElementById("stock").value;
            
                var fila="<tr><td>"+id+"</td><td>"+titulo+"</td><td>"+director+"</td><td>"+sipnosis+"</td><td>"+"holloooo"+"</td><td>"
                +'<button type="button" class="btn btn-info" onclick="mostrarPeli('+id+')" >Actualizar</button>'
                +'<button type="button" class="btn btn-danger" onclick="borrarPeli('+id+')">Borrar</button>'+"</td></tr>";
            
                var btn = document.createElement("TR");
                btn.innerHTML=fila;
                document.getElementById("tablita").appendChild(btn);
            });
            
        }
    }
    ajax.send();

}
function guardarPeli(){
    var ajax = new XMLHttpRequest();
    ajax.open("POST","http://localhost:8082/peliculas/");
    ajax.setRequestHeader(
        'Content-Type','application/json;charset=UTF-8'
    )
    ajax.onreadystatechange=function(){
        if(ajax.status == 200 && ajax.readyState == 4){
            document.getElementById("tablita").innerHTML="";
            dameLoMio()

        }
    }
    ajax.send(
        JSON.stringify(
            { 
                titulo: document.getElementById("titulo").value,
                director: document.getElementById("director").value,
                sipnosis: document.getElementById("sipnosis").value,
                categorias: "holaaa",
            }
        )
    )

}
function updatePeli(){
    var ajax = new XMLHttpRequest();
    ajax.open("PUT","http://localhost:8082/peliculas/"+document.getElementById("id").value);
    ajax.setRequestHeader(
        'Content-Type','application/json;charset=UTF-8'
    )
    ajax.onreadystatechange=function(){
        if(ajax.status == 200 && ajax.readyState == 4){
            document.getElementById("tablita").innerHTML="";
            dameLoMio()
            document.getElementById("actualizar").Attribute("disabled"); 
            document.getElementById("guardar").removeAttribute("disabled"); 

        }
    }
    ajax.send(
        JSON.stringify(
            { 
                titulo: document.getElementById("titulo").value,
                director: document.getElementById("director").value,
                sipnosis: document.getElementById("sipnosis").value,
                categorias: "holaaa",
            }
        )
    )

}
function mostrarPeli(num){
    var ajax = new XMLHttpRequest();
    ajax.open("GET","http://localhost:8082/peliculas/"+num);
    ajax.onreadystatechange=function(){
        if(ajax.status == 200 && ajax.readyState == 4){
            var pelicula = JSON.parse(ajax.response);
            console.log(pelicula);
            document.getElementById("id").value=pelicula.id,
            document.getElementById("titulo").value=pelicula.titulo,
            document.getElementById("director").value=pelicula.director,
            document.getElementById("sipnosis").value=pelicula.sipnosis,
            document.getElementById("categorias").value="holaa",   
            document.getElementById("actualizar").removeAttribute("disabled"); 
            document.getElementById("guardar").Attribute("disabled"); 
            
        }
    }
    ajax.send();
           
}
function borrarPeli(num){
    var ajax = new XMLHttpRequest();
    ajax.open("DELETE","http://localhost:8082/peliculas/"+num);
    ajax.onreadystatechange = function (){
        if(ajax.status == 200 && ajax.readyState == 4){
            document.getElementById("tablita").innerHTML="";
            dameLoMio()
        }
    }
    ajax.send()
}

    
