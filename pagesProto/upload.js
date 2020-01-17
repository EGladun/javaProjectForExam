var uform = document.querySelector('.upload_form')

uform.addEventListener('change', function(event){
    
    var url = 'http://localhost:8080/'
    
    event.preventDefault()
    var file = document.querySelector('.file')
    //console.log(file.value.split('.').pop())
    if(file.value.split('.').pop() == "xml"){
        alert("Молодец, формат подходит, будем обрабатывать-отправлять на " + url)
    } else {
        alert("Ты что, дуранчелиус? Формат только XML")
    }
})