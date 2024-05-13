

# LatePolicies


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a late policy record. |  |
|**courseId** | **Object** | The ID of the course this late policy references. |  |
|**createdAt** | **Object** | Timestamp of when a &#x60;late_policies&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;late_policies&#x60; record was updated. |  |
|**missingSubmissionDeductionEnabled** | **Object** | Whether to apply a deduction for submissions that have not been submitted as of their due date. |  |
|**missingSubmissionDeduction** | **Object** | The amount to award for a missing submission, expressed as a percentage (from 0 to 100) of the assignment&#39;s possible points. |  |
|**lateSubmissionDeductionEnabled** | **Object** | Whether to apply a deduction for submissions submitted late. |  |
|**lateSubmissionDeduction** | **Object** | The amount to deduct from the submission for each interval it is late, expressed as a percentage (from 0 to 100) of the assignment&#39;s possible points. |  |
|**lateSubmissionInterval** | **Object** | The interval at which points should be deducted: valid values are &#x60;day&#x60; and &#x60;hour&#x60;. |  |
|**lateSubmissionMinimumPercentEnabled** | **Object** | True if the points deducted for lateness should be capped. |  |
|**lateSubmissionMinimumPercent** | **Object** | If late_submission_minimum_percent_enabled is true, prevents late deductions from bringing a submission below this percentage of the total points. A value between 0 and 100. |  |



