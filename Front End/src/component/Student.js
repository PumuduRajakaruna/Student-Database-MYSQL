import * as React from 'react';
import Box from '@mui/material/Box';
import TextField from '@mui/material/TextField';
import { Container,Paper, Button} from '@mui/material';
import '../component/Student.css';

function Student() {
    const paperStyle = {padding: '50px 20px', width:600, margin: '20px auto'}

    const[Fname,setFname] = React.useState('')
    const[Lname,setLname] = React.useState('')
    const[address,setAddress] = React.useState('')
    const[dob,setDob] = React.useState('')
    const[grade,setGrade] = React.useState('')
    const[telephoneNo,setTelephoneNo] = React.useState('')
    const[guardianName,setGuardianName] = React.useState('')


    const handleClick =(e) => { 
        e.preventDefault()
        const student = {Fname,Lname,address,dob,grade,telephoneNo,guardianName}
        console.log(student)
        fetch("http://localhost:8080/api/v1/student",{
            method: "POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(student)
        }).then(()=>{
            console.log("New Student Added")
        })

    }

  return (
     
    <Container className='container'>
    <Paper elevation={3} style={paperStyle}>
    <h1 className = "topic">Add New Student</h1>
    <Box
      component="form"
      sx={{
        '& > :not(style)': { m: 1},
      }}
      noValidate
      autoComplete="off"
    >
      <TextField id="Fname" label="First Name" variant="outlined"  fullWidth
       value={Fname}
       onChange={(e)=>setFname(e.target.value)}
       />
      <TextField id="Lname" label="Last Name" variant="outlined" fullWidth 
       value={Lname}
       onChange={(e)=>setLname(e.target.value)}
       />
      <TextField id="address" label="Address" variant="outlined" fullWidth
       value={address}
       onChange={(e)=>setAddress(e.target.value)}
      />
      <TextField id="dob" label="Date of Birth" variant="outlined" fullWidth
       value={dob}
       onChange={(e)=>setDob(e.target.value)}
      />
      <TextField id="grade" label="Grade" variant="outlined" fullWidth
       value={grade}
       onChange={(e)=>setGrade(e.target.value)}
       />
      <TextField id="telephoneNo" label="Telephone No" variant="outlined" fullWidth
       value={telephoneNo}
       onChange={(e)=>setTelephoneNo(e.target.value)}
      />
      <TextField id="guardianName" label="Guardian's Name" variant="outlined" fullWidth
       value={guardianName}
       onChange={(e)=>setGuardianName(e.target.value)}
      />
      <Button variant="contained" onClick={handleClick}>Sumbit</Button>
    </Box>
    </Paper>
    </Container>
  );
}

export default Student;