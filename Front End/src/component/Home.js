import React from 'react'
//import Appbar from '../component/appbar';
import '../component/Home.css'
import Menu from '../component/Menu.js'

export default function Home() {
  return (
    <div>
      <Menu />
      <h1 className='header'>WELCOME TO THE STUDENT REGISTRATION PLATFORM</h1>
    </div>
  )
}
