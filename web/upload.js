var uform = document.querySelector('.upload_form')

uform.addEventListener('change', function(event){

    function uploadFile(file) {
        let url = 'http://localhost:8080/'
        let formData = new FormData()
        formData.append('file', file)
        fetch(url, {
          method: 'POST',
          body: formData
        })
        .then(() => { console.log("Файл отправлен") })
        .catch(() => { console.log("Файл НЕ отправлен") })
      }
    
    event.preventDefault()
    var file = document.querySelector('.file')
    //console.log(file.value.split('.').pop())
    if(file.value.split('.').pop() == "xml"){
        uploadFile(file)
    } else {
        console.log("Поддерживается только XML")
    }
})