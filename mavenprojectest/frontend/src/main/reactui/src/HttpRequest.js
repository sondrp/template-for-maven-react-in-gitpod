import axios from 'axios';
const instance = axios.create({
    withCredentials: true
  })
  

export default function get() {
    return instance.get("https://8080-sondrp-gitpodtesting-5cobtnvpwe0.ws-eu73.gitpod.io/")
                .then(response => console.log("working"))
}