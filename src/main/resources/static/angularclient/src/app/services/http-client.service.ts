import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

export class User {
  constructor(
  public id: string,
  public username: string,
  public email: string,
  public password: string,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) {
  }

  getUsers()
  {
    console.log("test call");
    return this.httpClient.get<User[]>('http://localhost:8080/users');
  }

  public deleteUser(user) {
    return this.httpClient.delete<User>("http://localhost:8080/users" + "/"+ user.id);
  }

  public addUser(user) {
    return this.httpClient.post<User>("http://localhost:8080/users", user);
  }

}
