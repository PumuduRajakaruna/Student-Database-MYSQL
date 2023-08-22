import React from 'react'
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import Button from 'react-bootstrap/Button';
import Col from 'react-bootstrap/Col';
import '../component/Login.js';
import '../component/documents.svg';

export default function Menu() {
  return (
    <>
    <Navbar data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="/">RegisterMe</Navbar.Brand>
          <Navbar.Brand href="/">
            <img
              src="../component/documents.svg"
              width="30"
              height="30"
              className="d-inline-block align-top"
              alt=" "
            />
          </Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/">Home</Nav.Link>
            <Nav.Link href="#features">Features</Nav.Link>
            <Nav.Link href="/Student">Add New Student</Nav.Link>
          </Nav>
          <Col xs="auto">
            <Nav.Link href="/Login"><Button type="Login" >Login</Button></Nav.Link>
          </Col>
        </Container>
      </Navbar>
  </>
    
  )
}
