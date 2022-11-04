import axios from 'axios';
const instance = axios.create({
    withCredentials: true
  })

  
  
  export default function get() {

    const requestUrl = origin.replace("3000", "8080")
    console.log(origin)
    return instance.get(requestUrl)
                .then(response => console.log("working"))
}