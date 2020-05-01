import http from "../http-common";

class TutorialDataService {
  getAll() {
    return http.get("/userdata");
  }

  get(id) {
    return http.get(`/userdata/${id}`);
  }

  create(data) {
    return http.post("/userdata", data);
  }

  update(id, data) {
    return http.put(`/userdata/${id}`, data);
  }

  delete(id) {
    return http.delete(`/userdata/${id}`);
  }

  deleteAll() {
    return http.delete(`/userdata`);
  }

  findByTitle(title) {
    return http.get(`/userdata?title=${title}`);
  }
}

export default new TutorialDataService();