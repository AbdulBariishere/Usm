import axios from "axios";

export default axios.create({
  baseURL: "http://13.233.112.236:8080/api",
  headers: {
    "Content-type": "application/json"
  }
});