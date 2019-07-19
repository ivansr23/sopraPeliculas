function initialize(){
  var lista = document.getElementById("lista");
  var li2 = document.createElement("li");
  var textLi2 = document.createTextNode("2")
  li2.appendChild(textLi2)
  lista.insertBefore(li2,lista.children[1]);
  var li4 = document.createElement("li");
  var textLi4 = document.createTextNode("4")
  li4.appendChild(textLi4)
  lista.insertBefore(li4,lista.children[3])
}