import React from 'react'
import Appbar from '../component/appbar';
import '../component/Home.css'
import Login from './Login';

export default function Home() {
  return (
    <div>
      <Login />
      <h1 className='header'>WELCOME TO THE STUDENT REGISTRATION PLATFORM</h1>
    </div>
  )
}
