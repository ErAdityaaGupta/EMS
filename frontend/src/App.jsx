import { useEffect, useState } from "react";
import axios from "axios";
import "./App.css"; // Import external CSS file

function App() {
    const [employees, setEmployees] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8080/api/employees")
            .then(response => {
                setEmployees(response.data);
            })
            .catch(error => {
                console.error("Error fetching employees:", error);
            });
    }, []);

    return (
        <div className="container">
            <h1 className="title">Employee List</h1>

            <table className="table">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>City</th>
                </tr>
                </thead>
                <tbody>
                {employees.length > 0 ? (
                    employees.map(employee => (
                        <tr key={employee.id}>
                            <td>{employee.id}</td>
                            <td>{employee.name}</td>
                            <td>{employee.city}</td>
                        </tr>
                    ))
                ) : (
                    <tr>
                        <td colSpan="3" className="no-data">No employees found</td>
                    </tr>
                )}
                </tbody>
            </table>
        </div>
    );
}

export default App;
