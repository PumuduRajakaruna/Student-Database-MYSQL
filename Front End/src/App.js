
import { BrowserRouter as Router , Route, Routes} from 'react-router-dom';
import Student from './component/Student';
import Home  from './component/Home';

function App() {
  return (
   <Router>
    <Routes>
      <Route path="/" element={<Home />} />
      <Route path="/Student" element={<Student />} />
    </Routes> 
  </Router>

  );
}

export default App;
