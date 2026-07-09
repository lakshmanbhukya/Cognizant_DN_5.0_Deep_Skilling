import { CohortsData } from './Cohort'
import CohortDetails from './CohortDetails'
import './App.css'

function App() {


  return (
    <>
      <h1>Cohorts Details</h1>
    {CohortsData.map(cohort => <CohortDetails cohort={cohort}/>)}
    </>
  )
}

export default App
